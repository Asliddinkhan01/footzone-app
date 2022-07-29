package com.footzone.footzone.entity.comment;


import java.util.UUID;

public interface CommentProjection {

    UUID getCommentId();

    Byte getRate();

    String getText();

    UUID getStadiumId();

    String getUserFullName();

    String getCreatedAt();

    String getUserAttachmentName();

}
