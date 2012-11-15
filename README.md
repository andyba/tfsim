tfsim
=====

Small project to demonstrate PrimeFaces PUSH driving Raphael supported SVG animations

Notes
=====

I have only tested this using Glassfish 3.1.2.1!
You have to have Comet and WebSocket support for the GF http listeners activated for this to work.
You will need to supply the SFL4J dependency yourself in order to get this working with Glassfish.
I removed this so that the demo works with Apache servers like TomEE (which it does).
For instance I simply placed slf4j-api-1.7.2.jar in the glassfish/domains/domain1/lib/ext folder and restarted the server.
