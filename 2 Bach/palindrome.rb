if ARGV[0].nil?
	puts "Enter your string:"
	string = gets.chomp
else
	string = ARGV[0].to_s
end

cleanstring = string.gsub(/[^a-zA-Z0-9]/,'')

cleanstring.downcase!

palin = false

# Option 1 - Check upon the characters (medium)

length = cleanstring.length

n = 0
m = -1

until n == (length/2).to_i
	if (cleanstring[n] == cleanstring[m])
		palin = true
	else
		palin = false
	end
	n += 1
	m -= 1
end

# Option 2 - Check for reverse (easier)

if cleanstring == cleanstring.reverse
	palin = true

puts palin.to_s