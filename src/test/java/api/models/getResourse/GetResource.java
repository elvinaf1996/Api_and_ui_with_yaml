package api.models.getResourse;

import api.Support;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResource {
    @JsonProperty("data")
    private ResourceData data;
    @JsonProperty("support")
    private Support support;
}
