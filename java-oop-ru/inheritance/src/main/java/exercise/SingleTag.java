package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String startName, Map<String, String> attribute) {
        super(startName, attribute);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(startName);
        sb.append(" ");
        for (Map.Entry<String, String> entry: attribute.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append("\"" + entry.getValue() + "\"");
            sb.append(" ");
        }
        String result = sb.toString();
        return (result.trim() + ">");
    }
}