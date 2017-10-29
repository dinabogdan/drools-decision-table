package com.sample.freesoft.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.freesoft.person.MaritalStatus;
import com.sample.freesoft.person.Person;

public class Main {
	public static void main(String[] args) {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("ksession-rules");
		
		Person singlePerson = new Person();
		singlePerson.setStatus(MaritalStatus.MARRIED_FILING_JOINTLY);
		singlePerson.setIncome(2000);
		kieSession.insert(singlePerson);
		
		Person marriedPerson = new Person();
		marriedPerson.setStatus(MaritalStatus.MARRIED_FILING_JOINTLY);
		marriedPerson.setIncome(65000);
		kieSession.insert(marriedPerson);
		
		kieSession.fireAllRules();
		
		System.out.println(singlePerson.getTaxRate());
		System.out.println(marriedPerson.getTaxRate());
	}

}
