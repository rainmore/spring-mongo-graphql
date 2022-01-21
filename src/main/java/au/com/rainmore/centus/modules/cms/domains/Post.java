package au.com.rainmore.centus.modules.cms.domains;

import au.com.rainmore.centus.modules.core.domains.HasId;
import au.com.rainmore.centus.modules.core.domains.HasName;
import au.com.rainmore.centus.modules.core.domains.Model;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@QueryEntity
@Document(collection = Post.COLLECTION_NAME)
@TypeAlias(value = Post.COLLECTION_NAME)
public class Post implements Model, HasId, HasName {

    public static final String COLLECTION_NAME = "cmsPosts";

    private String id;
    private String name;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @DBRef
    private Category category;

    @Id
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @CreatedDate
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @LastModifiedDate
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
