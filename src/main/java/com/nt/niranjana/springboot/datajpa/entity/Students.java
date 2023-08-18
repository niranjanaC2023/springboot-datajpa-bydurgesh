package com.nt.niranjana.springboot.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="STUDENTS")
public class Students  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer sno;		
	private  String sname;		
	private  String saddrs;		
	private  Float ssal;

	@Override
	public String toString() {
		return "Students [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", ssal=" + ssal + "]";
	}
}
