package com.sogeti.clientreview.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.sogeti.clientreview.documents.User;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc="User")
public interface UserRepo extends CouchbasePagingAndSortingRepository<User, String>{
	


}
