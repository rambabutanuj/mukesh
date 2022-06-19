package ibm.reg;

import org.springframework.stereotype.Component;

@Component
public class RegistBean {
String name;
String phone;
String adhar;
String add;
String stCode;
String stName;
String distCode;
String distName;

public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getDistName() {
	return distName;
}
public void setDistName(String distName) {
	this.distName = distName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAdhar() {
	return adhar;
}
public void setAdhar(String adhar) {
	this.adhar = adhar;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;
}

}
