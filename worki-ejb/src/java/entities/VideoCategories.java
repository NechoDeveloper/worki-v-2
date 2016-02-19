/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ahmed
 */
@Entity
@Table(name = "video_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VideoCategories.findAll", query = "SELECT v FROM VideoCategories v"),
    @NamedQuery(name = "VideoCategories.findByCategoryID", query = "SELECT v FROM VideoCategories v WHERE v.categoryID = :categoryID"),
    @NamedQuery(name = "VideoCategories.findByParentID", query = "SELECT v FROM VideoCategories v WHERE v.parentID = :parentID"),
    @NamedQuery(name = "VideoCategories.findBySubjectID", query = "SELECT v FROM VideoCategories v WHERE v.subjectID = :subjectID"),
    @NamedQuery(name = "VideoCategories.findByCategoryName", query = "SELECT v FROM VideoCategories v WHERE v.categoryName = :categoryName"),
    @NamedQuery(name = "VideoCategories.findByCategoryDescription", query = "SELECT v FROM VideoCategories v WHERE v.categoryDescription = :categoryDescription"),
    @NamedQuery(name = "VideoCategories.findByVideosCount", query = "SELECT v FROM VideoCategories v WHERE v.videosCount = :videosCount"),
    @NamedQuery(name = "VideoCategories.findByForumCategoryID", query = "SELECT v FROM VideoCategories v WHERE v.forumCategoryID = :forumCategoryID")})
public class VideoCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoryID")
    private Integer categoryID;
    @Column(name = "parentID")
    private Integer parentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subjectID")
    private int subjectID;
    @Size(max = 255)
    @Column(name = "categoryName")
    private String categoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "categoryDescription")
    private String categoryDescription;
    @Column(name = "videosCount")
    private Integer videosCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forumCategoryID")
    private int forumCategoryID;

    public VideoCategories() {
    }

    public VideoCategories(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public VideoCategories(Integer categoryID, int subjectID, String categoryDescription, int forumCategoryID) {
        this.categoryID = categoryID;
        this.subjectID = subjectID;
        this.categoryDescription = categoryDescription;
        this.forumCategoryID = forumCategoryID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Integer getVideosCount() {
        return videosCount;
    }

    public void setVideosCount(Integer videosCount) {
        this.videosCount = videosCount;
    }

    public int getForumCategoryID() {
        return forumCategoryID;
    }

    public void setForumCategoryID(int forumCategoryID) {
        this.forumCategoryID = forumCategoryID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryID != null ? categoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoCategories)) {
            return false;
        }
        VideoCategories other = (VideoCategories) object;
        if ((this.categoryID == null && other.categoryID != null) || (this.categoryID != null && !this.categoryID.equals(other.categoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.VideoCategories[ categoryID=" + categoryID + " ]";
    }
    
}
