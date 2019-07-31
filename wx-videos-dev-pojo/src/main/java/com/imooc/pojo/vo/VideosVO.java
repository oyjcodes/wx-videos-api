package com.imooc.pojo.vo;

import java.util.Date;
import javax.persistence.*;

public class VideosVO {
    private String id;
    private String userId;
    private String audioId;
    private String videoDesc;
    private String videoPath;
    private Float videoSeconds;
    private Integer videoWidth;
    private Integer videoHeight;
    private String coverPath;
    private Long likeCounts;
    private Integer status;
    private Date createTime;

    private String faceImage;
    private String nickname;

	public String getFaceImage() {
		return faceImage;
	}

	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取发布者id
     *
     * @return user_id - 发布者id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置发布者id
     *
     * @param userId 发布者id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户使用音频的信息
     *
     * @return audio_id - 用户使用音频的信息
     */
    public String getAudioId() {
        return audioId;
    }

    /**
     * 设置用户使用音频的信息
     *
     * @param audioId 用户使用音频的信息
     */
    public void setAudioId(String audioId) {
        this.audioId = audioId;
    }

    /**
     * 获取视频描述
     *
     * @return video_desc - 视频描述
     */
    public String getVideoDesc() {
        return videoDesc;
    }

    /**
     * 设置视频描述
     *
     * @param videoDesc 视频描述
     */
    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    /**
     * 获取视频存放的路径
     *
     * @return video_path - 视频存放的路径
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * 设置视频存放的路径
     *
     * @param videoPath 视频存放的路径
     */
    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    /**
     * 获取视频秒数
     *
     * @return video_seconds - 视频秒数
     */
    public Float getVideoSeconds() {
        return videoSeconds;
    }

    /**
     * 设置视频秒数
     *
     * @param videoSeconds 视频秒数
     */
    public void setVideoSeconds(Float videoSeconds) {
        this.videoSeconds = videoSeconds;
    }

    /**
     * 获取视频宽度
     *
     * @return video_width - 视频宽度
     */
    public Integer getVideoWidth() {
        return videoWidth;
    }

    /**
     * 设置视频宽度
     *
     * @param videoWidth 视频宽度
     */
    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    /**
     * 获取视频高度
     *
     * @return video_height - 视频高度
     */
    public Integer getVideoHeight() {
        return videoHeight;
    }

    /**
     * 设置视频高度
     *
     * @param videoHeight 视频高度
     */
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    /**
     * 获取视频封面图
     *
     * @return cover_path - 视频封面图
     */
    public String getCoverPath() {
        return coverPath;
    }

    /**
     * 设置视频封面图
     *
     * @param coverPath 视频封面图
     */
    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    /**
     * 获取喜欢/赞美的数量
     *
     * @return like_counts - 喜欢/赞美的数量
     */
    public Long getLikeCounts() {
        return likeCounts;
    }

    /**
     * 设置喜欢/赞美的数量
     *
     * @param likeCounts 喜欢/赞美的数量
     */
    public void setLikeCounts(Long likeCounts) {
        this.likeCounts = likeCounts;
    }

    /**
     * 获取视频状态：
1、发布成功
2、禁止播放，管理员操作
     *
     * @return status - 视频状态：
1、发布成功
2、禁止播放，管理员操作
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置视频状态：
1、发布成功
2、禁止播放，管理员操作
     *
     * @param status 视频状态：
1、发布成功
2、禁止播放，管理员操作
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}