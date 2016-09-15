// generated file, do not modify!
// 2016-09-15T19:44:47.624123918Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Slot {
  public enum Tag { 
    Slot
  }
  public Tag tag;

  public class Slot_ extends Slot { 
    public String slotName;
    public HashMap<String, InputType> slotStreams;
    public HashMap<String, InputType> slotUniforms;
    public FetchPrimitive slotPrimitive;
    public ArrayList<Integer> slotPrograms;
    public Slot_() { tag = Slot.Tag.Slot; }
  }
}

