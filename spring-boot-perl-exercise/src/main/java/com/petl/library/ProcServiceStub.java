package com.petl.library;

public class ProcServiceStub implements ProcService{

	@Override
	public String retrieveProc(String procReference) throws ProcNotFoundException {
		System.out.println(procReference);

		if(procReference.length()<5 || !procReference.substring(0, 5).equalsIgnoreCase("PROC-")) {
			throw new ProcNotFoundException("Exception, informing the client that book reference must begin with PROC");
		}
		
		Proc pref= ProcRepositoryStub.prefList.get(procReference);
		
		if(pref == null) {
			throw new ProcNotFoundException("ProcNotFoundException");
		}
		 
		return pref.getProcDescription();
	}

	@Override
	public String getProcSummary(String procReference) throws ProcNotFoundException {
		System.out.println(procReference);

		if(procReference.length()<5 || !procReference.substring(0, 5).equalsIgnoreCase("PROC-")) {
			throw new ProcNotFoundException("Exception, informing the client that book reference must begin with PROC");
		}
		
		Proc pref= ProcRepositoryStub.prefList.get(procReference);
		
		if(pref == null) {
			throw new ProcNotFoundException("ProcNotFoundException");
		}
		 
		 return pref.getProcSummary();
		
	}


}
