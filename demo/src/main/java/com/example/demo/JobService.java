package com.example.demo;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;
public interface JobService 
{
	public String getCollectionName();
	void setCollectionName(String collectionName);
	public List<TT> getList();
}