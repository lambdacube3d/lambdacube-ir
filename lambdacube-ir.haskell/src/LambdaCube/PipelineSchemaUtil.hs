{-# LANGUAGE FlexibleContexts, TypeSynonymInstances, FlexibleInstances #-}
module LambdaCube.PipelineSchemaUtil where

import Control.Monad.Writer
import qualified Data.Map as Map
import LambdaCube.PipelineSchema

a @: b = tell [(a,b)]
defObjectArray n p m = mapM_ tell [PipelineSchema (Map.singleton n $ ObjectArraySchema p $ Map.singleton a t) mempty | (a,t) <- execWriter m]
defUniforms m = tell $ PipelineSchema mempty $ Map.fromList $ execWriter m
makeSchema a = execWriter a :: PipelineSchema

unionObjectArraySchema (ObjectArraySchema a1 b1) (ObjectArraySchema a2 b2) =
  ObjectArraySchema (if a1 == a2 then a1 else error $ "object array schema primitive mismatch " ++ show (a1,a2))
                    (Map.unionWith (\a b -> if a == b then a else error $ "object array schema attribute type mismatch " ++ show (a,b)) b1 b2)

instance Monoid PipelineSchema where
  mempty = PipelineSchema mempty mempty
  mappend (PipelineSchema a1 b1) (PipelineSchema a2 b2) =
    PipelineSchema (Map.unionWith unionObjectArraySchema a1 a2) (Map.unionWith (\a b -> if a == b then a else error $ "schema type mismatch " ++ show (a,b)) b1 b2)
