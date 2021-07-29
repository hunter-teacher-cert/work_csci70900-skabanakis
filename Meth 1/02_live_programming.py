#When we print out anything in Python, we use " "
#example:
print"Hello World"

#we want to get into the habit of running the code 
#frequently to make sure that it works properly

#to first create a variable, we need to name the variable, and then assign its value
# if we are creating a string variable it will be in inbetween quotes " " (single or double "" '')
verb = "running"
print(verb)
#integer - whole numbers that is either positive or negative.
# it does not have a decimal point
day = 40
hours = 24
#using your variables, I want you find find the total number of hours in a 40 day span.
print(day *hours)

#floats - is a positive or negative number with a decimal point 
pi =3.14
# if you are unsure what type of of variable is being stored you can call the function (type)
#this will print out what is being stored in that variable
print(type(day))
print(type(pi))
print(type(verb))


#now if you want to create a new variable to hold the total number of hours in 40 days 
#how would you create it?
total = day *hours
print(total)

#converting between intergers and float
#to convert to integer = int()
# to convert to float = float()
#convert int variable to float
print(day)
print(float(day))
