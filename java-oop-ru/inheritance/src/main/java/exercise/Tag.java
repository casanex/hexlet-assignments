package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    public String startName;
    public Map<String, String> attribute;

    public Tag(String startName, Map<String, String> attribute) {
        this.startName = startName;
        this.attribute = attribute;
    }


}
// END
