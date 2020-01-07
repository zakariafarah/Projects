print (" ")
print (" ")
import random
import time

matchr1m1 = []
matchr1m2 = []
matchr1m3 = []
matchr1m4 = []

#prompt user for teams in the first 4 mathces

print ("Enter the teams in the first round/matchup")

for i in range (2):
    r1m1 = input()
    matchr1m1.append(r1m1)
print ("Round 1 match 1, teams are: ", matchr1m1)

print (" ")


print ("Enter the teams in the first round/matchup")

for i in range (2):
    r1m2 = input()
    matchr1m2.append(r1m2)
print ("Round 1 match 2, teams are: ", matchr1m2)
print (" ")

print ("Enter the teams in the first round/matchup")

for i in range (2):
    r1m3 = input()
    matchr1m3.append(r1m3)
print ("Round 1 match 3, teams are: ", matchr1m3)
print (" ")

print ("Enter the teams in the first round/matchup")


for i in range (2):
    r1m4 = input()
    matchr1m4.append(r1m4)
print ("Round 1 match 4, teams are: ", matchr1m4)



print (" ")
print ("first round winnres are")
r1m1_winner = random.choice(matchr1m1)
print ("Round 1 match 1 winner: ", r1m1_winner)
r1m2_winner = random.choice(matchr1m2)
print ("Round 1 match 1 winner: ", r1m2_winner)

r1m3_winner = random.choice(matchr1m3)
print ("Round 1 match 1 winner: ", r1m3_winner)

r1m4_winner = random.choice(matchr1m4)
print ("Round 1 match 1 winner: ", r1m4_winner)


print ("--------------------")
time.sleep(2)

#create list for second round matchup

print(" ")
print ("Round 2")

matchr2m1 = [r1m1_winner, r1m2_winner]
matchr2m2 = [r1m3_winner, r1m4_winner]

print("The second round matchups are : ")

print("Round 2 match 1: ", matchr2m1)
print("Round 2 match 2: ", matchr2m2)
print(" ")
r2m1_winner = random.choice(matchr2m1)
r2m2_winner = random.choice(matchr2m2)
print ("Round 2 Match 1 winner is: ", r2m1_winner)
print ("Round 2 Match 2 winner is: ", r2m2_winner)
print (" ")
print (" ----------------------------")
time.sleep (2)

#create lists for third round matchups

print (" ")
print ("Round 3 ")

matchr3m1 = [r2m1_winner, r2m2_winner]

r3m1_winner = random.choice(matchr3m1)
print ("The championsip match is: ", matchr3m1)
r3m1_winner = random.choice (matchr3m1)
print ("The champion is: ", r3m1_winner)

print (" ")
print (" ")
print (" ")
time.sleep(2)




