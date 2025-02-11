# 🌟 Kkyu-OA 企业员工管理系统 - 后端代码

## 📝 项目简介
> 🎓 本后端项目是 **Kkyu-OA 企业员工管理系统** 的核心组成部分，提供高效的用户、角色、权限及数据管理能力，为企业的信息化管理提供坚实的技术支撑。

## 🏗️ 技术栈
- 🌟 **框架**: Spring Boot
- 🔒 **权限认证**: Spring Security + JWT
- 🚀 **缓存**: Redis
- 🛠 **数据库**: MySQL
- 📜 **动态权限**: 灵活的权限管理方案，支持菜单和按钮级别的控制

## 📌 核心功能
- 👥 **用户管理**: 提供用户信息管理及多终端登录支持。
- 🏢 **部门管理**: 支持树形结构组织管理，清晰展现公司架构。
- 🎭 **角色管理**: 自定义角色权限范围，支持数据范围划分。
- 📑 **菜单管理**: 动态生成菜单结构，灵活调整操作权限。
- 💼 **岗位管理**: 定义并关联用户职务，简化岗位信息管理。
- 🔐 **权限控制**: 基于 JWT 实现，支持单点登录和多终端认证。

## 🚀 安装步骤

📌 **项目地址**: `git@github.com:Kkikikkxx/kkyu-oa.git`

1️⃣ **克隆代码仓库**:

   ```bash
   git clone git@github.com:Kkikikkxx/kkyu-oa.git
   cd kkyu-oa
   ```

2️⃣ **创建数据库**:

进入 `sql` 文件夹，执行 `base.sql`。

   ```bash
   mysql -u root -p < sql/base.sql
   ```

3️⃣ **修改配置**:

根据实际环境，更新 `application.yml` 文件中的数据库及 Redis 配置。

4️⃣ **启动项目**:

在启动类点击运行按钮，默认服务运行在 `http://localhost:8080`

## 🔧 系统需求
- ☕ **JDK** >= 17
- 🐬 **MySQL** >= 8.2
- 📦 **Maven** >= 3.6
- 🔴 **Redis** >= 4

## 📂 目录结构

```plaintext
.
├── LICENSE               # 开源协议
├── README.md             # 项目文档
├── kkyu-admin            # 管理端模块
│   ├── pom.xml
│   ├── src
│   └── target
├── kkyu-common           # 公共模块
│   ├── pom.xml
│   ├── src
│   └── target
├── kkyu-finance          # 财务模块
│   ├── pom.xml
│   └── src
├── kkyu-framework        # 核心框架模块
│   ├── pom.xml
│   ├── src
│   └── target
├── kkyu-generator        # 辅助功能模块
│   ├── pom.xml
│   ├── src
│   └── target
├── kkyu-system           # 系统模块
│   ├── pom.xml
│   ├── src
│   └── target
├── pom.xml               # 父项目配置文件
└── sql
    └── base.sql          # 初始化 SQL 文件
```

## 🌟 特性亮点
- 🔄 **动态权限管理**: 支持按用户角色动态加载菜单和功能权限。
- 🌐 **多终端认证**: 基于 JWT 的认证机制，支持多端安全登录。
- 📊 **模块化设计**: 清晰的模块划分，便于扩展和维护。

## 📜 开源协议
📄 本项目采用 **MIT 许可证**。

## 🎉 鸣谢

🙏 特别感谢 **Ruoyi 开源框架** 的灵感与帮助，及社区开发者们的优秀支持！

💡 **如果觉得这个项目对你有帮助，欢迎 Star ⭐️ 支持！**

---
