cd ~/Repository
echo "Sync activation... "

while true; do
	if [[ -n $(git status -s) ]]; then
		echo "New changes in: $(date +%H:%M:%S). Loading... "
		git add .
		git commit -m "Auto Sync: $(date: +'%Y-%m-%d %H:%M:%S') "
		git push origin master
		echo "Sync completed <................................> "
	fi
		sleep 60
done
