INSERT INTO tb_role (role_id, role_name) VALUES (1, 'ADMIN') ON CONFLICT (ROLE_ID) DO NOTHING;
INSERT INTO tb_role (role_id, role_name) VALUES (2, 'COMMON') ON CONFLICT (ROLE_ID) DO NOTHING;
INSERT INTO tb_role (role_id, role_name) VALUES (3, 'MANAGER') ON CONFLICT (ROLE_ID) DO NOTHING;
INSERT INTO tb_role (role_id, role_name) VALUES (4, 'MEMBER') ON CONFLICT (ROLE_ID) DO NOTHING;
INSERT INTO tb_role (role_id, role_name) VALUES (5, 'LEADER') ON CONFLICT (ROLE_ID) DO NOTHING;