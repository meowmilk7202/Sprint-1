package vn.iotstar.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name = "Project")
@NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p")
public class Project implements Serializable {

	@Id
	private Long id;

	private String name;
	private String desciption;
	private String muctieu;
	private String yeucau;
	private int soLuongsv;
	private boolean isfaculty;
	private String faculty;
	private String nienkhoa;
	private float point;
	private int idtimeproject;
	private Date create_at;
	private Date update_at;
	private boolean is_active;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getMuctieu() {
		return muctieu;
	}
	public void setMuctieu(String muctieu) {
		this.muctieu = muctieu;
	}
	public String getYeucau() {
		return yeucau;
	}
	public void setYeucau(String yeucau) {
		this.yeucau = yeucau;
	}
	public int getSoLuongsv() {
		return soLuongsv;
	}
	public void setSoLuongsv(int soLuongsv) {
		this.soLuongsv = soLuongsv;
	}
	public boolean isIsfaculty() {
		return isfaculty;
	}
	public void setIsfaculty(boolean isfaculty) {
		this.isfaculty = isfaculty;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getNienkhoa() {
		return nienkhoa;
	}
	public void setNienkhoa(String nienkhoa) {
		this.nienkhoa = nienkhoa;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public int getIdtimeproject() {
		return idtimeproject;
	}
	public void setIdtimeproject(int idtimeproject) {
		this.idtimeproject = idtimeproject;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
}
