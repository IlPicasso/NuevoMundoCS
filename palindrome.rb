if ARGV[0].nil?
	puts "Enter your string:"
	string = gets.chomp
else
	string = ARGV[0].to_s
end

cleanstring = string.gsub(/[^a-zA-Z0-9]/,'')

cleanstring.downcase!

length = cleanstring.length

n = 0
m = -1

palin = false

until n == (length/2).to_i
	if (cleanstring[n] == cleanstring[m])
		palin = true
	else
		palin = false
	end
	n += 1
	m -= 1
end

puts palin.to_s