package com.qhit.lh.gr3.cyh.exam.examScores.bean;

import com.qhit.lh.gr3.cyh.exam.common.bean.TUser;
import com.qhit.lh.gr3.cyh.exam.paper.bean.TPaper;

// Generated 2018-2-22 16:43:35 by Hibernate Tools 3.4.0.CR1

/**
 * TUserScores generated by hbm2java
 */
public class TUserScores implements java.io.Serializable {

	private int usId;
	private String name;
	private int pid;
	private String qids;
	private String answers;
	private Integer score;
	
	private TUser user;
	private TPaper paper;
	public TUserScores() {
	}

	public TUserScores(int usId, String name, int pid) {
		this.usId = usId;
		this.name = name;
		this.pid = pid;
	}

	public TUserScores(int usId, String name, int pid, String qids, String answers, Integer score) {
		this.usId = usId;
		this.name = name;
		this.pid = pid;
		this.qids = qids;
		this.answers = answers;
		this.score = score;
	}

	public int getUsId() {
		return this.usId;
	}

	public void setUsId(int usId) {
		this.usId = usId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getQids() {
		return this.qids;
	}

	public void setQids(String qids) {
		this.qids = qids;
	}

	public String getAnswers() {
		return this.answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public TUser getUser() {
		return user;
	}

	public TPaper getPaper() {
		return paper;
	}


	public void setUser(TUser user) {
		this.user = user;
	}

	public void setPaper(TPaper paper) {
		this.paper = paper;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TUserScores [usId=");
		builder.append(usId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", pid=");
		builder.append(pid);
		builder.append(", qids=");
		builder.append(qids);
		builder.append(", answers=");
		builder.append(answers);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}

}
