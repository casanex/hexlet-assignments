package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag  extends Tag {
    public String body;
    public List<Tag> children;
    public PairedTag(String startName, Map<String, String> attribute, String body, List<Tag> children) {
        super(startName, attribute);
        this.body = body;
        this.children = children;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(startName);
        for (Map.Entry<String, String> entry: attribute.entrySet()) {
            sb.append(" " + entry.getKey() + "=");
            sb.append("\"" + entry.getValue() + "\"");
            }
            sb.append(">");
        for(Tag element: children) {
            sb.append(element.toString());
        }
        sb.append(body);
        sb.append("</" + startName + ">");

        return sb.toString();

    }

}
// END
