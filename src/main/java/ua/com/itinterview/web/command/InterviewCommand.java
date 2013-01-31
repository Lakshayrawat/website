package ua.com.itinterview.web.command;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import ua.com.itinterview.entity.InterviewEntity;
import ua.com.itinterview.entity.UserEntity;

public class InterviewCommand {

    private UserEntity user;

    @NotNull
    @NotBlank
    private String feedback;

    private Date created;

    public InterviewCommand() {

    }

    public InterviewCommand(InterviewEntity interviewEntity) {
	user = interviewEntity.getUser();
	feedback = interviewEntity.getFeedback();
	created = interviewEntity.getCreated();
    }

    public UserEntity getUser() {
	return user;
    }

    public void setUser(UserEntity user) {
	this.user = user;
    }

    public String getFeedback() {
	return feedback;
    }

    public void setFeedback(String feedback) {
	this.feedback = feedback;
    }

    public Date getCreated() {
	return created;
    }

    public void setCreated(Date created) {
	this.created = created;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((created == null) ? 0 : created.hashCode());
	result = prime * result
		+ ((feedback == null) ? 0 : feedback.hashCode());
	result = prime * result + ((user == null) ? 0 : user.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	InterviewCommand other = (InterviewCommand) obj;
	if (created == null) {
	    if (other.created != null)
		return false;
	} else if (!created.equals(other.created))
	    return false;
	if (feedback == null) {
	    if (other.feedback != null)
		return false;
	} else if (!feedback.equals(other.feedback))
	    return false;
	if (user == null) {
	    if (other.user != null)
		return false;
	} else if (!user.equals(other.user))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "InterviewCommand [user=" + user + ", feedback=" + feedback
		+ ", created=" + created + "]";
    }

}