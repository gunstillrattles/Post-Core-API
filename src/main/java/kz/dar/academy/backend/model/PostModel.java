package kz.dar.academy.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostModel {
    private String postId;
    private String clientId;
    private String postRecipientId;
    @Size(min = 2, max = 16, message = "Post name must be greater than 2 and less than 16")
    private String postItem;
    private String status;
}