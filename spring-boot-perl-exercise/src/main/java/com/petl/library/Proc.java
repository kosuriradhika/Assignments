package com.petl.library;

public class Proc {
	
	public String procReference;
	public String procDescription;
	public String procSummary;
	
	public Proc(String procReference, String procDescription, String procSummary) {
		this.procReference = procReference;
		this.procDescription = procDescription;
		this.procSummary = procSummary;
		
	}
	
	public String getProcReference() {
		return procReference;
	}
	public void setProcReference(String procReference) {
		this.procReference = procReference;
	}
	public String getProcDescription() {
		return procDescription;
	}
	public void setProcDescription(String procDescription) {
		this.procDescription = procDescription;
	}
	public String getProcSummary() {
		return procSummary;
	}
	public void setProcSummary(String procSummary) {
		this.procSummary = procSummary;
	}
	
}
