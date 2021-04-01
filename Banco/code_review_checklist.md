# Code Review Checklist for Developers

- [ ] My code compiles
- [ ] My code has been developer-tested and includes unit tests
- [ ] My code includes javadoc where appropriate
- [ ] My code is tidy (indentation, line length, no commented-out code, no spelling mistakes, etc)
- [ ] I have considered proper use of exceptions
- [ ] I have made appropriate use of logging
- [ ] I have eliminated unused imports
- [ ] I have eliminated warnings
- [ ] I have considered possible NPEs
- [ ] The code follows the Coding Standards
- [ ] Are there any leftover stubs or test routines in the code?
- [ ] Are there any hardcoded, development only things still in the code?
- [ ] Incomplete  code  is  indicated  with  appropriate distinctive markers (e.g. “TODO” or “FIXME”).
- [ ] Was performance considered?
- [ ] Was security considered?
- [ ] Does the code release resources? (HTTP connections, DB connection, files, etc)
- [ ] Corner cases well documented or any workaround for a known limitation of the frameworks
- [ ] Can any code be replaced by calls to external reusable components or library functions?
- [ ] Thread safety and possible deadlocks

---


[Code Review Guideline](https://www.codeproject.com/Articles/524235/Codeplusreviewplusguidelines)
[The Best Kept Secrets of Peer Code Review](https://smartbear.com/resources/ebooks/best-kept-secrets-of-code-review/)
