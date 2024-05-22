### 项目简介

这是一个使用 Kotlin 语言编写的多模块示例项目，包含三个子项目：`project-common`、`project-b` 和 `project-a`。每个项目模块都展示了如何使用 Spring Boot 和 Kotlin 进行开发，并展示了如何在不同模块之间共享代码和配置。

---

### 目录结构

```
kotlin-example/
│
├── project-a/
│   ├── src/
│   │   └── main/
│   │       ├── kotlin/
│   │       │   └── com/example/projecta/
│   │       │       ├── MainApplication.kt
│   │       │       ├── StrategyContext.kt
│   │       │       └── DefaultStrategy.kt
│   │       └── resources/
│   └── pom.xml
│
├── project-b/
│   ├── src/
│   │   └── main/
│   │       ├── kotlin/
│   │       │   └── com/example/customstrategy/
│   │       │       └── CustomStrategy.kt
│   │       └── resources/
│   └── pom.xml
│
├── project-common/
│   ├── src/
│   │   └── main/
│   │       ├── kotlin/
│   │       │   └── com/example/common/
│   │       │       └── Strategy.kt
│   │       └── resources/
│   └── pom.xml
│
└── pom.xml
```

---

### 安装与运行

#### 先决条件

- JDK 17
- Maven 3.6+

#### 步骤

1. **克隆项目**
    ```bash
    git clone https://github.com/shixukai/kotlin-example.git
    cd kotlin-example
    ```

2. **构建 `project-common`**
    ```bash
    cd project-common
    mvn clean install
    ```

3. **构建 `project-b`**
    ```bash
    cd ../project-b
    mvn clean install
    ```

4. **构建和运行 `project-a`**
    ```bash
    cd ../project-a
    mvn clean install
    mvn spring-boot:run
    ```

---

### 动态切换配置

在这个项目中，我们通过使用 `@Primary` 注解实现了策略的动态切换：

- `@Primary` 注解用于标识优先使用的 `Bean`。在这里，我们将 `@Primary` 注解添加到 `CustomStrategy` 类上，确保在注入 `Strategy` 时，默认使用的是 `CustomStrategy`。

这种配置方式使得我们可以灵活地切换和管理不同的策略实现，而无需修改业务逻辑代码，只需在配置中调整即可。

### 贡献

如果您发现任何问题或有改进建议，欢迎提交 Issue 或 Pull Request。

### 许可

该项目基于 MIT 许可证开源，详情请参阅 [LICENSE](LICENSE) 文件。

---

如果您有任何问题或需要进一步的帮助，请随时联系我！
