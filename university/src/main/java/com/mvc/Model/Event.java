package com.mvc.Model;

public class Event {
     private String id;
	private String event_name;
	private String event_descr;
	private String dateofevent;
	private String addrs;
	private String phone;
	private String email;
	private String rules;
        private String complaint;
        private String uname;
        private String attend;
        private String like;
        private String intrest;

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getIntrest() {
        return intrest;
    }

    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
        

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_descr() {
		return event_descr;
	}
	public void setEvent_descr(String event_descr) {
		this.event_descr = event_descr;
	}
	public String getDateofevent() {
		return dateofevent;
	}
	public void setDateofevent(String dateofevent) {
		this.dateofevent = dateofevent;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}


}
