# print(r'C:\docs\navin') # row string r means
# x = 10
# str = "Imran"
# boolen = False
# y = 10.0
# print(type(x))
# print(type(str))
# print(type(boolen))
# print(type(y))

# num1 = 4
# num2 = 8
# c = num1 + num2
# print(c)
# # d = _ + num2 # _ use for previous value 12 + 8 
# # print(d)

# youtube = "YOUTUBE"
# print(youtube[-2]) # if will give - value then its count end of the string
# print(youtube[2:6]) # use range for substring

user_input_rows = int(input("Enter Your Rows Number : "))
user_input_cols = int(input("Enter Your Colunms Number : "))

#  1st pattern (solid rectangle)
'''
 * * * * *
 * * * * *
 * * * * *
 * * * * *
'''
# print("Solid Rectangle ")

# for i in range(user_input_rows):
#     for j in range(user_input_cols):
#         print("*" , end= ' ')
#     print()

#  2st pattern (solid rectangle)
'''
 * * * * *
 *       *
 *       *
 * * * * *
'''
# print("hollow Rectangle ")

# for i in range(user_input_rows):
#     for j in range(user_input_cols):
#         if(i == 0 or j == 0 or j == user_input_cols-1 or i == user_input_rows-1):
#             print("# " , end=" ")
#         else:
#             print("  " , end=" ")
#     print()

for i in range(1,user_input_rows): # range(start,stop,step)
    for j in range(user_input_rows,1,i):
        print("  ", end=" ")
    for j in range(i):
       print("* " , end=" ")
    print()