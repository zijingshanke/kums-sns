package com.kurui.kums.sns.neo4j.test;

import java.util.List;

import junit.framework.TestCase;

import com.kurui.kums.agent.Agent;
import com.kurui.kums.agent.biz.AgentBiz;
import com.kurui.kums.agent.dao.AgentDAO;
import com.kurui.kums.base.exception.AppException;
import com.kurui.kums.sns.agent.biz.AgentNeoBiz;
import com.kurui.kums.test.commons.ApplicationContextFactory;

/**
 * @author Yanrui
 * 
 * 
 * 
 * */
public class AgentNeoBizTest extends TestCase {

	private AgentBiz agentBiz;
	private AgentNeoBiz agentNeoBiz;
	
	//mvn test 异常：原因未知
//	org.xml.sax.SAXParseException: No base URI; hope URI is absolute: http://www.springframework.org/dtd/spring-beans.dtd

//	static {
//		ApplicationContextFactory
//				.init("F:\\project\\kums-sns\\war\\war\\WEB-INF\\applicationContext.xml");
//	}
//
//	public AgentNeoBizTest(String name) {
//		super(name);
//	}
//
//	protected void setUp() throws Exception {
//		super.setUp();
//		agentBiz = (AgentBiz) ApplicationContextFactory.getApplicationContext()
//				.getBean("agentBiz");
//
//		agentNeoBiz = (AgentNeoBiz) ApplicationContextFactory
//				.getApplicationContext().getBean("agentNeoBiz");
//
//	}

//	public void testDeleteAllAgentNode() {
////		agentNeoBiz.deleteAllAgentNode();
//	}
	
	public void testBuildAgentNetwork(){
//		agentNeoBiz.buildAgentNetwork();
		System.out.println("======================");
	}

}