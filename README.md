Example of Package namespacing in Play Framework (Java) app
-----------------------------------------------------------

It's not really obvious how you could use the non default package namespace in play framework 2.4.x.

The [official doc](https://playframework.com/documentation/2.4.x/Anatomy#The-app/-directory) simply has a one liner:

> Note that in Play, the controllers, models and views package name conventions are now just that
> and can be changed if needed (such as prefixing everything with com.yourcompany).

This solution has the bare bone components to show how it could be done.

It showcases:

1. the project folder structure
2. config referencing modules from a custom package
3. views referencing layouts and partials from a custom package
4. views referencing models from a custom package
5. views referencing helper from a sub-project library
6. routes referencing controllers from a custom package
7. build.sbt building solutions and internal library with custom packages


Run `activator run`.
