// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

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

