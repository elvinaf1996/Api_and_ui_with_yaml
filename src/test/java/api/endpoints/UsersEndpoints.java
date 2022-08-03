package api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UsersEndpoints {
    USER("/users/%s"),
    USERS("/users"),
    USERS_PAGE("/users?page=%S");

    private String url;
}
