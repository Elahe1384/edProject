package example;

import db.Entity;
import db.Trackable;
import java.util.Date;

public class Document extends Entity implements Trackable {
    public String content;
    private Date creationDate;
    private Date lastModificationDate;

    public Document(String content) {
        if (content == null) {
            throw new IllegalArgumentException("Content cannot be null");
        }
        this.content = content;
    }


    @Override
    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setLastModificationDate(Date date) {
        this.lastModificationDate = date;
    }

    @Override
    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    @Override
    public Document copy() {
        Document copy = new Document(content);
        copy.id = this.id;
        copy.creationDate = new Date(this.creationDate.getTime());
        copy.lastModificationDate = new Date(this.lastModificationDate.getTime());
        return copy;
    }

    @Override
    public int getEntityCode() {
        return 15;
    }
}