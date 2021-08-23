
# Operating-Systems

Briefly summarize The Gaming Room client and their software requirements. Who was the client? What type of software did they want you to design?
	The Gaming Room client requested that a web based game that serves mulitple platforms that is based on their current app that is only available on Android mobile devices. 	       The game is called Draw it or Lose it that allows teams of players to guess the image that is being drawn. The client requested that the game be able to run with one or 	         more teams, uniqueness of game and team names is required, and only one instance of the game can be saved in memory at a time.  
What did you do particularly well in developing this documentation?
	Developing the first portion of this document was done well. This is the portion of the document that lays out the Executive Summary, Design Constraints, Domain Model, 	etc.     The client provided very clear and concise instructions and software requirements to create this portion of the document. The Domain mModel is explained and 		illustrated well 	 enough to portray the plan for the project to the client. The Executive Summary and Design Constraints clearly correlate to the clients requests. 

What about the process of working through a design document did you find helpful when developing the code?
	The entire process was helpful in developing the code as there are factors that you may not think about when creating code like storage, memory, or even operating systems. 	    	In past expereinces, I've just created code and not had to worry about those factors and how it would effect the client. So, the design document was very helpful in 	 putting 		everything into prospective when creating code. 
	
If you could choose one part of your work on these documents to revise, what would you pick? How would you improve it?
	I would choose to revise the Evaluation within the document. I would revise the Developmental Tools that are available for the project. I was thinking more about what
	developmental tools we could use to create a server on the specific operating systems and not so much about what would be needed to create Java code for that operating 	system. 	So, I would focus more on the developmental tools that are needed to create code on each operating system. 
How did you interpret the user’s needs and implement them into your software design? Why is it so important to consider the user’s needs when designing?
	For the game to work per the clients request, there needed to be one game at a time and each player, team, and game had its own ID. To do this, we created iterator and
	singleton patterns within the code. The singleton patterns allow only one instance of the game at a time while the iterator patterns to add and get games, teams, and 		players 	so that each identifier could continue to be unique. Its important to consider the user's needs when designing because while we are creating this for the client, 	  this is 
	ultimately for the user. 
How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?
	My approach for designing software was to try to tackle every aspect of designing software at once. In the future, this will not be my approach. My future strategy for 
	analyzing and designing a similar software application or any software applicationw ill be to take my time and make sure that I am considering all of my factors. Throught 
	this design document, I would find a way around one design constraint and then forget that I also have this other design constraint that this work around doesnt solve. So, 	     in the future, my motto will be to take my time when designing software as it is all not just writing code. 
