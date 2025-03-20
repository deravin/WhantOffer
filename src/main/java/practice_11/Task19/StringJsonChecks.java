package practice_11.Task19;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringJsonChecks {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
