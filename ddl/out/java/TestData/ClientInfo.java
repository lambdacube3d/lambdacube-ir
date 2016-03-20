// generated file, do not modify!
// 2016-03-21T11:41:52.508392000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class ClientInfo {
  public enum Tag { 
    ClientInfo
  }
  public Tag tag;

  public class ClientInfo_ extends ClientInfo { 
    public String clientName;
    public Backend clientBackend;
    public ClientInfo_() { tag = ClientInfo.Tag.ClientInfo; }
  }
}

