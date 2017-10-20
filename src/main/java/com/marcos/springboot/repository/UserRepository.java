package com.marcos.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.repository.custom.UserRepositoryCustom;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom, QueryDslPredicateExecutor<User>{//, QuerydslBinderCustomizer<QMyUser> {

//	@Override
//	default public void customize(QuerydslBindings bindings, QMyUser root) {
//		bindings.bind(String.class)
//				.first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
//		bindings.excluding(root.email);
//	}
	
	User findByUsername(String username);
}
