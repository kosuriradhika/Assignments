package com.petl.library;

import java.util.HashMap;
import java.util.Map;

public class ProcRepositoryStub implements ProcRepository{
	
	public static final Map<String, Proc> prefList = new HashMap<String, Proc>();

	@Override
	public void generateProc() {
		Proc p1 = new Proc("PROC-PGISP472", "Information Security Procedures ", "[PROC-PGISP472] Information security constitutes information protection in all forms.");
		Proc p2 = new Proc("PROC-PSAP987", "software in the white ", "[PROC-PSAP987] Only software in the white list can be installed…");
		
		prefList.put("PROC-PGISP472", p1);
		prefList.put("PROC-PSAP987", p2);
		
		
	}

}
