-- generated file, do not modify!
<<<<<<< d022971b99be214c71429d58f97f85b13e33a426
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
-- 2016-03-01T13:00:40.810157000000Z
=======
-- 2016-03-20T21:42:12.996366000000Z
>>>>>>> working c# backend
=======
-- 2016-03-20T22:19:43.646837000000Z
>>>>>>> fix c#
=======
-- 2016-03-21T11:36:01.199696000000Z
>>>>>>> work on java json loader
=======
-- 2016-03-21T11:41:52.460562000000Z
>>>>>>> improve java json

{-# LANGUAGE OverloadedStrings, RecordWildCards #-}
module LambdaCube.TypeInfo where

import Data.Int
import Data.Word
import Data.Map
import Data.Vector (Vector(..))
import LambdaCube.Linear

import Data.Text
import Data.Aeson hiding (Value,Bool)
import Data.Aeson.Types hiding (Value,Bool)
import Control.Monad

import LambdaCube.IR

data Range
  = Range
  { startLine :: Int
  , startColumn :: Int
  , endLine :: Int
  , endColumn :: Int
  }

  deriving (Show, Eq, Ord)

data TypeInfo
  = TypeInfo
  { range :: Range
  , text :: String
  }

  deriving (Show, Eq, Ord)

data CompileResult
  = CompileError (Vector Range) String (Vector TypeInfo)
  | Compiled String String Pipeline (Vector TypeInfo)
  deriving (Show, Eq, Ord)


instance ToJSON Range where
  toJSON v = case v of
    Range{..} -> object
      [ "tag" .= ("Range" :: Text)
      , "startLine" .= startLine
      , "startColumn" .= startColumn
      , "endLine" .= endLine
      , "endColumn" .= endColumn
      ]

instance FromJSON Range where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "Range" -> do
        startLine <- obj .: "startLine"
        startColumn <- obj .: "startColumn"
        endLine <- obj .: "endLine"
        endColumn <- obj .: "endColumn"
        pure $ Range
          { startLine = startLine
          , startColumn = startColumn
          , endLine = endLine
          , endColumn = endColumn
          } 
  parseJSON _ = mzero

instance ToJSON TypeInfo where
  toJSON v = case v of
    TypeInfo{..} -> object
      [ "tag" .= ("TypeInfo" :: Text)
      , "range" .= range
      , "text" .= text
      ]

instance FromJSON TypeInfo where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "TypeInfo" -> do
        range <- obj .: "range"
        text <- obj .: "text"
        pure $ TypeInfo
          { range = range
          , text = text
          } 
  parseJSON _ = mzero

instance ToJSON CompileResult where
  toJSON v = case v of
    CompileError arg0 arg1 arg2 -> object [ "tag" .= ("CompileError" :: Text), "arg0" .= arg0, "arg1" .= arg1, "arg2" .= arg2]
    Compiled arg0 arg1 arg2 arg3 -> object [ "tag" .= ("Compiled" :: Text), "arg0" .= arg0, "arg1" .= arg1, "arg2" .= arg2, "arg3" .= arg3]

instance FromJSON CompileResult where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "CompileError" -> CompileError <$> obj .: "arg0" <*> obj .: "arg1" <*> obj .: "arg2"
      "Compiled" -> Compiled <$> obj .: "arg0" <*> obj .: "arg1" <*> obj .: "arg2" <*> obj .: "arg3"
  parseJSON _ = mzero

