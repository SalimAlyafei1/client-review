package com.sogeti.clientreview;


import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@EnableCouchbaseRepositories("com.sogeti.clientreview.repository")
@EnableAutoConfiguration
@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {
	
	@Value("${couchBase.serverList}")
	private String hostNames;
	@Value("${couchBase.userName}")
	private String userName;
	@Value("${couchBase.password}")
	private String password;
	
	
	@Override
	protected List<String> getBootstrapHosts()
	{
		return Collections.singletonList(hostNames);
	}
	
	@Override
	protected String getBucketName()
	{
		return userName;
	}
	
	@Override
	protected String getBucketPassword()
	{
		return password;
	}
	
	

}
