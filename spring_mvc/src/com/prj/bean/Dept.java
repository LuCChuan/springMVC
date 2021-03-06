package com.prj.bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DEPT", schema = "SCOTT")
public class Dept implements java.io.Serializable {

	// Fields

	private Byte deptno;
	private String dname;
	private String loc;
	private Set<Emp> emps = new HashSet<Emp>(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(Byte deptno) {
		this.deptno = deptno;
	}

	/** full constructor */
	public Dept(Byte deptno, String dname, String loc, Set<Emp> emps) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}

	// Property accessors
	@Id
	@Column(name = "DEPTNO", unique = true, nullable = false, precision = 2, scale = 0)
	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	@Column(name = "DNAME", length = 14)
	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Column(name = "LOC", length = 13)
	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dept")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}