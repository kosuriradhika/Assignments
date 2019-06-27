package com.petl.library;

public interface ProcService {
	
	public String retrieveProc(String procReference) throws ProcNotFoundException;
	public String getProcSummary(String procReference) throws ProcNotFoundException;

}
