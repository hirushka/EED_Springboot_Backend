package com.waruni96.emergency_excercise.security;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.waruni96.emergency_excercise.model.User;

public class UserPrincipal implements UserDetails {

	private String name;

	private String userName;

	@JsonIgnore
	private int roleId;

	@JsonIgnore
	private String password;

	private Collection<? extends GrantedAuthority> authorities;

	public UserPrincipal(String name, String userName,int roleId, String password
			/*,
			Collection<? extends GrantedAuthority> authorities*/) {
		this.name = name;
		this.userName = userName;
		//this.email = email;
		this.roleId = roleId;
		this.password = password;
		//this.authorities = authorities;
	}

	public static UserPrincipal create(User user) {
//		List<GrantedAuthority> authorities = user.getRoles().stream()
//				.map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());
		List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//		authorities.add(new SimpleGrantedAuthority("USER_ADMIN"));

		return new UserPrincipal(user.getUsername(), user.getUsername(), user.getRoleId(),user.getPassword()/*,
				authorities*/);
	}



	public String getName() {
		return name;
	}

	public int getRoleId() {
		return roleId;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserPrincipal that = (UserPrincipal) o;
		return Objects.equals(userName, that.userName);
	}

	@Override
	public int hashCode() {

		return Objects.hash(userName);
	}
}
