print "Enter value for a: "
a = gets.chomp
print "Enter value for b: "
b = gets.chomp

a_i = a.to_i
b_i = b.to_i

c = 0

while a_i != 0 # until a_i == 0
    c += a_i + b_i
    puts c
    a_i = a_i - 1
    b_i = b_i + 2
end
