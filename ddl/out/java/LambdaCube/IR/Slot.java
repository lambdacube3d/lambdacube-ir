// generated file, do not modify!
// 2016-11-11T11:17:02.701527000000Z

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

