package daos;

import models.BlogPost;

public interface BlogPostDao {

    BlogPost createBlogPost(BlogPost blogPost);

    BlogPost readBlogPost(String id);

    void deleteBlogPost(String blogPostId);

    void updateBlogPost(BlogPost blogPost);

}
