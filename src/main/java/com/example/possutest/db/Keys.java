/*
 * This file is generated by jOOQ.
 */
package com.example.possutest.db;


import com.example.possutest.db.tables.PermissionGroup;
import com.example.possutest.db.tables.Role;
import com.example.possutest.db.tables.RolePermission;
import com.example.possutest.db.tables.records.PermissionGroupRecord;
import com.example.possutest.db.tables.records.RolePermissionRecord;
import com.example.possutest.db.tables.records.RoleRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PermissionGroupRecord, Integer> IDENTITY_PERMISSION_GROUP = Identities0.IDENTITY_PERMISSION_GROUP;
    public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<RolePermissionRecord, Integer> IDENTITY_ROLE_PERMISSION = Identities0.IDENTITY_ROLE_PERMISSION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PermissionGroupRecord> PERMISSION_GROUP_PKEY = UniqueKeys0.PERMISSION_GROUP_PKEY;
    public static final UniqueKey<RoleRecord> ROLE_PKEY = UniqueKeys0.ROLE_PKEY;
    public static final UniqueKey<RolePermissionRecord> ROLE_PERMISSION_PKEY = UniqueKeys0.ROLE_PERMISSION_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PermissionGroupRecord, PermissionGroupRecord> PERMISSION_GROUP__PERMISSION_GROUP_PARENT_ID_FKEY = ForeignKeys0.PERMISSION_GROUP__PERMISSION_GROUP_PARENT_ID_FKEY;
    public static final ForeignKey<RoleRecord, PermissionGroupRecord> ROLE__ROLE_GROUP_ID_FKEY = ForeignKeys0.ROLE__ROLE_GROUP_ID_FKEY;
    public static final ForeignKey<RolePermissionRecord, RoleRecord> ROLE_PERMISSION__ROLE_PERMISSION_ROLE_ID_FKEY = ForeignKeys0.ROLE_PERMISSION__ROLE_PERMISSION_ROLE_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PermissionGroupRecord, Integer> IDENTITY_PERMISSION_GROUP = Internal.createIdentity(PermissionGroup.PERMISSION_GROUP, PermissionGroup.PERMISSION_GROUP.ID);
        public static Identity<RoleRecord, Integer> IDENTITY_ROLE = Internal.createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<RolePermissionRecord, Integer> IDENTITY_ROLE_PERMISSION = Internal.createIdentity(RolePermission.ROLE_PERMISSION, RolePermission.ROLE_PERMISSION.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PermissionGroupRecord> PERMISSION_GROUP_PKEY = Internal.createUniqueKey(PermissionGroup.PERMISSION_GROUP, "permission_group_pkey", PermissionGroup.PERMISSION_GROUP.ID);
        public static final UniqueKey<RoleRecord> ROLE_PKEY = Internal.createUniqueKey(Role.ROLE, "role_pkey", Role.ROLE.ID);
        public static final UniqueKey<RolePermissionRecord> ROLE_PERMISSION_PKEY = Internal.createUniqueKey(RolePermission.ROLE_PERMISSION, "role_permission_pkey", RolePermission.ROLE_PERMISSION.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<PermissionGroupRecord, PermissionGroupRecord> PERMISSION_GROUP__PERMISSION_GROUP_PARENT_ID_FKEY = Internal.createForeignKey(com.example.possutest.db.Keys.PERMISSION_GROUP_PKEY, PermissionGroup.PERMISSION_GROUP, "permission_group__permission_group_parent_id_fkey", PermissionGroup.PERMISSION_GROUP.PARENT_ID);
        public static final ForeignKey<RoleRecord, PermissionGroupRecord> ROLE__ROLE_GROUP_ID_FKEY = Internal.createForeignKey(com.example.possutest.db.Keys.PERMISSION_GROUP_PKEY, Role.ROLE, "role__role_group_id_fkey", Role.ROLE.GROUP_ID);
        public static final ForeignKey<RolePermissionRecord, RoleRecord> ROLE_PERMISSION__ROLE_PERMISSION_ROLE_ID_FKEY = Internal.createForeignKey(com.example.possutest.db.Keys.ROLE_PKEY, RolePermission.ROLE_PERMISSION, "role_permission__role_permission_role_id_fkey", RolePermission.ROLE_PERMISSION.ROLE_ID);
    }
}
