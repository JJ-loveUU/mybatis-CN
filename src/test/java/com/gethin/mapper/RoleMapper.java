package com.gethin.mapper;

import com.gethin.po.Role;

/**
 * @Author yh
 * @Date 2020/11/8 18:09
 */
public interface RoleMapper {
  public Role getRole(Long id);
  public Role findRole(String roleName);
  public int deleteRole(Long id);
  public int insertRole(Role role);
}
