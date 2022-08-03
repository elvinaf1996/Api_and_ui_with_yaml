package api.models.postRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class PostRegisterAnswer {
    @JsonProperty("id")
    private int id;
    @JsonProperty("token")
    private String token;
}
