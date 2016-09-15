// generated file, do not modify!
// 2016-09-15T19:44:48.147167874Z

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

