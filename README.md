# bankApp

Kotlin native abstraction (in separate module) of business logic. Using a core module (interface) in different projects (potentially even web applications), we inject the interface-using-projects with a implementation of the core.

Added Koin dependency for injection BankImplementationProvider<br/>
Added application class, to inject in onCreate().
